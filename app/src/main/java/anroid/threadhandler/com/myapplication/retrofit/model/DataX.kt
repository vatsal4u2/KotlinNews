package anroid.threadhandler.com.myapplication.retrofit.model

import android.view.View
import anroid.threadhandler.com.myapplication.NewsApp
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataX(

    @SerializedName("all_awardings")
    val allAwardings: List<Any>,
    @SerializedName("allow_live_comments")
    val allowLiveComments: Boolean,
    @SerializedName("approved_at_utc")
    val approvedAtUtc: Any,
    @SerializedName("approved_by")
    val approvedBy: Any,
    @SerializedName("archived")
    val archived: Boolean,
    @SerializedName("author")
    val author: String,
    @SerializedName("author_flair_background_color")
    val authorFlairBackgroundColor: Any,
    @SerializedName("author_flair_css_class")
    val authorFlairCssClass: Any,
    @SerializedName("author_flair_richtext")
    val authorFlairRichtext: List<Any>,
    @SerializedName("author_flair_template_id")
    val authorFlairTemplateId: Any,
    @SerializedName("author_flair_text")
    val authorFlairText: Any,
    @SerializedName("author_flair_text_color")
    val authorFlairTextColor: Any,
    @SerializedName("author_flair_type")
    val authorFlairType: String,
    @SerializedName("author_fullname")
    val authorFullname: String,
    @SerializedName("author_patreon_flair")
    val authorPatreonFlair: Boolean,
    @SerializedName("banned_at_utc")
    val bannedAtUtc: Any,
    @SerializedName("banned_by")
    val bannedBy: Any,
    @SerializedName("can_gild")
    val canGild: Boolean,
    @SerializedName("can_mod_post")
    val canModPost: Boolean,
    @SerializedName("category")
    val category: Any,
    @SerializedName("clicked")
    val clicked: Boolean,
    @SerializedName("content_categories")
    val contentCategories: Any,
    @SerializedName("contest_mode")
    val contestMode: Boolean,
    @SerializedName("created")
    val created: Double,
    @SerializedName("created_utc")
    val createdUtc: Double,
    @SerializedName("discussion_type")
    val discussionType: Any,
    @SerializedName("distinguished")
    val distinguished: Any,
    @SerializedName("domain")
    val domain: String,
    @SerializedName("downs")
    val downs: Int,
   /* @SerializedName("edited")
    val edited: Boolean,*/
    @SerializedName("gilded")
    val gilded: Int,
    @SerializedName("hidden")
    val hidden: Boolean,
    @SerializedName("hide_score")
    val hideScore: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("is_crosspostable")
    val isCrosspostable: Boolean,
    @SerializedName("is_meta")
    val isMeta: Boolean,
    @SerializedName("is_original_content")
    val isOriginalContent: Boolean,
    @SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: Boolean,
    @SerializedName("is_robot_indexable")
    val isRobotIndexable: Boolean,
    @SerializedName("is_self")
    val isSelf: Boolean,
    @SerializedName("is_video")
    val isVideo: Boolean,
    @SerializedName("likes")
    val likes: Any,
    @SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String,
    @SerializedName("link_flair_css_class")
    val linkFlairCssClass: Any,
    @SerializedName("link_flair_richtext")
    val linkFlairRichtext: List<Any>,
    @SerializedName("link_flair_text")
    val linkFlairText: Any,
    @SerializedName("link_flair_text_color")
    val linkFlairTextColor: String,
    @SerializedName("link_flair_type")
    val linkFlairType: String,
    @SerializedName("locked")
    val locked: Boolean,
    @SerializedName("media")
    val media: Any,
    @SerializedName("media_only")
    val mediaOnly: Boolean,
    @SerializedName("mod_note")
    val modNote: Any,
    @SerializedName("mod_reason_by")
    val modReasonBy: Any,
    @SerializedName("mod_reason_title")
    val modReasonTitle: Any,
    @SerializedName("mod_reports")
    val modReports: List<Any>,
    @SerializedName("name")
    val name: String,
    @SerializedName("no_follow")
    val noFollow: Boolean,
    @SerializedName("num_comments")
    val numComments: Int,
    @SerializedName("num_crossposts")
    val numCrossposts: Int,
    @SerializedName("num_reports")
    val numReports: Any,
    @SerializedName("over_18")
    val over18: Boolean,
    @SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String,
    @SerializedName("permalink")
    val permalink: String,
    @SerializedName("pinned")
    val pinned: Boolean,
    @SerializedName("pwls")
    val pwls: Int,
    @SerializedName("quarantine")
    val quarantine: Boolean,
    @SerializedName("removal_reason")
    val removalReason: Any,
    @SerializedName("report_reasons")
    val reportReasons: Any,
    @SerializedName("saved")
    val saved: Boolean,
    @SerializedName("score")
    val score: Int,
    @SerializedName("secure_media")
    val secureMedia: SecureMedia,
    @SerializedName("selftext")
    val selftext: String,
    @SerializedName("selftext_html")
    val selftextHtml: Any,
    @SerializedName("send_replies")
    val sendReplies: Boolean,
    @SerializedName("spoiler")
    val spoiler: Boolean,
    @SerializedName("steward_reports")
    val stewardReports: List<Any>,
    @SerializedName("stickied")
    val stickied: Boolean,
    @SerializedName("subreddit")
    val subreddit: String,
    @SerializedName("subreddit_id")
    val subredditId: String,
    @SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String,
    @SerializedName("subreddit_subscribers")
    val subredditSubscribers: Int,
    @SerializedName("subreddit_type")
    val subredditType: String,
    @SerializedName("suggested_sort")
    val suggestedSort: Any,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("total_awards_received")
    val totalAwardsReceived: Int,
    @SerializedName("ups")
    val ups: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("user_reports")
    val userReports: List<Any>,
    @SerializedName("view_count")
    val viewCount: Any,
    @SerializedName("visited")
    val visited: Boolean,
    @SerializedName("whitelist_status")
    val whitelistStatus: String,
    @SerializedName("wls")
    val wls: Int
) : Serializable{

    val safe_thumbnail : String?
        get() = secureMedia?.oembed?.thumbnailUrl ?: ""
}