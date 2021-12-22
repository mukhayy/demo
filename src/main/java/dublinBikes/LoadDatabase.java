package dublinBikes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RootRepository repository) throws Exception {
        //reading from json
        String json = readUrl("https://app-media.noloco.app/noloco/dublin-bikes.json");
        Root[] rootData = new Gson().fromJson(json, Root[].class);

        //saves data to JPARepository
        return args -> {
            for (Root r: rootData){
                log.info("Preloading " + repository.save(
                        new Root(r.identifier, r.id, r.harvestTimeUTC, r.stationId, r.availableBikeStands, r.bikeStands, r.availableBikes,
                r.banking, r.bonus, r.lastUpdate, r.status, r.address, r.name, r.latitude, r.longitude)));
            }
        };
    }


    private String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
