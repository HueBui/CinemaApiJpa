package controller;


import handle.Handler;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import service.MovieService;
import main.main;
public class ListAllMovieController extends Handler {
    @Autowired
    private MovieService movieService;
    @Override
    public String doProcessPost(JSONObject params) {
        JSONObject js = new JSONObject();
        try {
            movieService = main.context.getBean("movieService", MovieService.class);
            js.put("Movie",movieService.listAllMovie());
            js.put("rc", "1");
            js.put("rd", "Success");
        }catch (Exception ex){
            js.put("rc", "-1");
            js.put("rd", "Err");
        }
        return js.toString();
    }
}
