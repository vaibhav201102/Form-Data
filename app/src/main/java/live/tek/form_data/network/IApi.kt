package live.tek.form_data.network

import live.tek.form_data.Result
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface IApi {

    @Multipart
    @POST("customer_app/cust_app_add_profile_image")
    fun uploadImage(@Part("CUSTOMER_ID") custID: Int, @Part filePart: MultipartBody.Part):Call<Result>


}