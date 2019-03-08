package service;

import entity.Director;
import entity.Movie;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositoty.DirectorRepo;
import repositoty.MovieRepo;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    @Autowired
    private DirectorRepo directorRepo;

    public JSONArray listAllMovie(){
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = null;

        List<Movie> list = movieRepo.findAll();
        List<Director> directorList = directorRepo.findAll();


        for (int i = 0; i<list.size(); i++){
            jsonObject = new JSONObject();
            jsonObject.put("idmovie",list.get(i).getIdmovie());
            jsonObject.put("moviename",list.get(i).getMoviename());
            jsonObject.put("discription",list.get(i).getDiscription());
            jsonObject.put("duration",list.get(i).getDuration());
            jsonObject.put("language",list.get(i).getLanguage());
            jsonObject.put("rate",list.get(i).getRated());
            jsonObject.put("trailer",list.get(i).getTrailler());
            jsonObject.put("image",list.get(i).getImage());
            jsonObject.put("start",list.get(i).getStart());
            for (int j=0; j<directorList.size(); j++){
                if (directorList.get(j).getIddirector()==list.get(i).getIddirector().getIddirector()){
                    jsonObject.put("namedirectory",directorList.get(j).getNamedirector());
                }
            }
            jsonArray.add(jsonObject);
        }

        return jsonArray;
    }
}
