package cordova.plugin.abl.ABLPlugin.interfaces;



import cordova.plugin.abl.ABLPlugin.model.CnicPostParams;
import cordova.plugin.abl.ABLPlugin.model.OtpPostParams;
import cordova.plugin.abl.ABLPlugin.model.OtpResponse;
import cordova.plugin.abl.ABLPlugin.model.ResponseDTO;
import cordova.plugin.abl.ABLPlugin.model.UpdateBioMetricStatusPostParams;
import cordova.plugin.abl.ABLPlugin.model.UpdateBioMetricStatusResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitApi {
    @POST("/RdaConsumer/api/consumer/public/bio-metric-verification")
    Call<ResponseDTO> CNICpost(@Body CnicPostParams cd);

    @POST("/RdaConsumer/api/consumer/verify-otp-bio-metric-verification")
    Call<OtpResponse> OtpPost(@Body OtpPostParams pp, @Header("Authorization") String accessToken);

    @POST("/RdaConsumer/api/consumer/update-bio-metric-verification-status")
    Call<UpdateBioMetricStatusResponse> UpdateBioMetricStatus(@Body UpdateBioMetricStatusPostParams pp, @Header("Authorization") String accessToken);

}
