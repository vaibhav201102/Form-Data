package live.tek.form_data

import com.google.gson.annotations.SerializedName


data class Result(
    val message:String,
    val data:DataItem
)


data class DataItem(
    @SerializedName("CUSTOMER_ID"                    ) var CUSTOMERID                 : Int?    = null,
    @SerializedName("FIRST_NAME"                     ) var FIRSTNAME                  : String? = null,
    @SerializedName("LAST_NAME"                      ) var LASTNAME                   : String? = null,
    @SerializedName("MOBILE_NUMBER"                  ) var MOBILENUMBER               : String? = null,
    @SerializedName("COUNTRY_CODE"                   ) var COUNTRYCODE                : String? = null,
    @SerializedName("EMAIL"                          ) var EMAIL                      : String? = null,
    @SerializedName("CURRENT_STOREID"                ) var CURRENTSTOREID             : Int?    = null,
    @SerializedName("PASSWORD"                       ) var PASSWORD                   : String? = null,
    @SerializedName("DOB"                            ) var DOB                        : String? = null,
    @SerializedName("GENDER"                         ) var GENDER                     : Int?    = null,
    @SerializedName("IS_ACTIVE"                      ) var ISACTIVE                   : Int?    = null,
    @SerializedName("NOTIFICATION_STATUS"            ) var NOTIFICATIONSTATUS         : Int?    = null,
    @SerializedName("SIGNUP_SOURCE"                  ) var SIGNUPSOURCE               : String? = null,
    @SerializedName("SIGNUP_SOURCE_TYPE"             ) var SIGNUPSOURCETYPE           : String? = null,
    @SerializedName("SOCIAL_MEDIA_TOKEN_ID"          ) var SOCIALMEDIATOKENID         : String? = null,
    @SerializedName("LONGITUDE"                      ) var LONGITUDE                  : String? = null,
    @SerializedName("LATITUDE"                       ) var LATITUDE                   : String? = null,
    @SerializedName("RECENT_OTP"                     ) var RECENTOTP                  : String? = null,
    @SerializedName("SIGNUP_DATE"                    ) var SIGNUPDATE                 : String? = null,
    @SerializedName("UTC_SIGNUP_DATE"                ) var UTCSIGNUPDATE              : String? = null,
    @SerializedName("LOCAL_TIME_ZONE_OFFSET_VALUE"   ) var LOCALTIMEZONEOFFSETVALUE   : String? = null,
    @SerializedName("DEVICE_TOKEN"                   ) var DEVICETOKEN                : String? = null,
    @SerializedName("DEVICE_TYPE"                    ) var DEVICETYPE                 : String? = null,
    @SerializedName("DEVICE_OS_VERSION"              ) var DEVICEOSVERSION            : String? = null,
    @SerializedName("DEVICE_MODEL"                   ) var DEVICEMODEL                : String? = null,
    @SerializedName("DEVICE_ID"                      ) var DEVICEID                   : String? = null,
    @SerializedName("DEVICE_IP_ADDRESS"              ) var DEVICEIPADDRESS            : String? = null,
    @SerializedName("IS_CUST_MOBILE_NUMBER_VERIFIED" ) var ISCUSTMOBILENUMBERVERIFIED : Int?    = null,
    @SerializedName("IS_CUST_EMAIL_VERIFIED"         ) var ISCUSTEMAILVERIFIED        : Int?    = null,
    @SerializedName("PROFILE_IMAGE_PATH"             ) var PROFILEIMAGEPATH           : String? = null,
    @SerializedName("TOKEN"                          ) var TOKEN                      : String? = null)