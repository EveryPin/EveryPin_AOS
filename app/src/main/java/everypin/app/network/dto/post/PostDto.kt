package everypin.app.network.dto.post


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostDto(
    @Json(name = "createdDate")
    val createdDate: String,
    @Json(name = "postContent")
    val postContent: String,
    @Json(name = "postId")
    val postId: Int,
    @Json(name = "updateDate")
    val updateDate: String?,
    @Json(name = "x")
    val x: Double,
    @Json(name = "y")
    val y: Double
)