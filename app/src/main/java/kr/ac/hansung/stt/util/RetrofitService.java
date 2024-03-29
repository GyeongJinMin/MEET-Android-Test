package kr.ac.hansung.stt.util;

import kr.ac.hansung.stt.data.Emotion;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitService {

    /* 감정분석 API */
    /* text + audio data 전송*/
    @Multipart
    @POST("get-emotion")
    Call<Emotion> get_post_text_and_voice(@Part MultipartBody.Part textFile, @Part MultipartBody.Part audioFile);

    /* text data만 전송 */
//    @Multipart
//    @POST("get-emotion")
//    Call<Emotion> get_post_text(@Part MultipartBody.Part file);

    /* audio data만 전송 */
//    @Multipart
//    @POST("get-emotion-from-voice")
//    Call<Emotion> get_post_voice(@Part MultipartBody.Part file);

    /* 카카오 음성인식 REST API */
    @POST("v1/recognize")
    Call<ResponseBody> get_post_pcm(
            @Header("Transfer-Encoding") String transferEncoding,
            @Header("Content-Type") String contentType,
            @Header("Authorization") String authorization,
            @Body RequestBody audio);
}
