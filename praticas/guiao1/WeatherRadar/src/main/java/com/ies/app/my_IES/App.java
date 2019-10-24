package com.ies.app.my_IES;


import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	 Retrofit retrofit = new Retrofit.Builder()
    			 .baseUrl("http://api.ipma.pt/open-data/")
    			 .addConverterFactory(GsonConverterFactory.create())
    			 .build();
    			 IpmaService service = retrofit.create(IpmaService.class);
    			 Call<IpmaCityForecast> callSync = service.getForecastForACity(1010500);
    			 try {
    			 Response<IpmaCityForecast> apiResponse = callSync.execute();
    			 IpmaCityForecast forecast = apiResponse.body();
    			 System.out.println( "max temp for today: " + forecast.getData().
    			 listIterator().next().getTMax());
    			 } catch (Exception ex) {
    			 ex.printStackTrace();
    			 }
    }
}
