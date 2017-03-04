package app.iwayinfo.feb20.network;

import android.database.Observable;
import com.google.api.client.googleapis.auth.clientlogin.ClientLogin;


import app.iwayinfo.feb20.model.User;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by IWAY on 04-03-2017.
 */

public interface RetrofitInterface {
    @POST("users")
    Observable<ClientLogin.Response> register(@Body User user);

    @POST("authenticate")
    Observable<ClientLogin.Response> login();

    @GET("users/{email}")
    Observable<User> getProfile(@Path("email") String email);

    @PUT("users/{email}")
    Observable<ClientLogin.Response> changePassword(@Path("email") String email, @Body User user);

    @POST("users/{email}/password")
    Observable<ClientLogin.Response> resetPasswordInit(@Path("email") String email);

    @POST("users/{email}/password")
    Observable<ClientLogin.Response> resetPasswordFinish(@Path("email") String email, @Body User user);
}
