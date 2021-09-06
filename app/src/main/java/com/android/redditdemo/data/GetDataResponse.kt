package com.android.redditdemo.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetDataResponse(
    @Json(name = "data")
    var dataInfo: Data? = Data(),
    @Json(name = "kind")
    var kind: String? = ""
) {
    @JsonClass(generateAdapter = true)
    data class Data(
        @Json(name = "after")
        var after: String? = "",
        @Json(name = "before")
        var before: Any? = Any(),
        @Json(name = "children")
        var children: List<Children?>? = listOf(),
        @Json(name = "dist")
        var dist: Int? = 0,
        @Json(name = "geo_filter")
        var geoFilter: Any? = Any(),
        @Json(name = "modhash")
        var modhash: String? = ""
    ) {
        @JsonClass(generateAdapter = true)
        data class Children(
            @Json(name = "data")
            var userData: UserData? = UserData(),
            @Json(name = "kind")
            var kind: String? = ""
        ) {
            @JsonClass(generateAdapter = true)
            data class UserData(
                @Json(name = "all_awardings")
                var allAwardings: List<AllAwarding?>? = listOf(),
                @Json(name = "allow_live_comments")
                var allowLiveComments: Boolean? = false,
                @Json(name = "approved_at_utc")
                var approvedAtUtc: Any? = Any(),
                @Json(name = "approved_by")
                var approvedBy: Any? = Any(),
                @Json(name = "archived")
                var archived: Boolean? = false,
                @Json(name = "author")
                var author: String? = "",
                @Json(name = "author_flair_background_color")
                var authorFlairBackgroundColor: Any? = Any(),
                @Json(name = "author_flair_css_class")
                var authorFlairCssClass: Any? = Any(),
                @Json(name = "author_flair_richtext")
                var authorFlairRichtext: List<AuthorFlairRichtext?>? = listOf(),
                @Json(name = "author_flair_template_id")
                var authorFlairTemplateId: Any? = Any(),
                @Json(name = "author_flair_text")
                var authorFlairText: Any? = Any(),
                @Json(name = "author_flair_text_color")
                var authorFlairTextColor: Any? = Any(),
                @Json(name = "author_flair_type")
                var authorFlairType: String? = "",
                @Json(name = "author_fullname")
                var authorFullname: String? = "",
                @Json(name = "author_is_blocked")
                var authorIsBlocked: Boolean? = false,
                @Json(name = "author_patreon_flair")
                var authorPatreonFlair: Boolean? = false,
                @Json(name = "author_premium")
                var authorPremium: Boolean? = false,
                @Json(name = "awarders")
                var awarders: List<Any?>? = listOf(),
                @Json(name = "banned_at_utc")
                var bannedAtUtc: Any? = Any(),
                @Json(name = "banned_by")
                var bannedBy: Any? = Any(),
                @Json(name = "can_gild")
                var canGild: Boolean? = false,
                @Json(name = "can_mod_post")
                var canModPost: Boolean? = false,
                @Json(name = "category")
                var category: Any? = Any(),
                @Json(name = "clicked")
                var clicked: Boolean? = false,
                @Json(name = "content_categories")
                var contentCategories: Any? = Any(),
                @Json(name = "contest_mode")
                var contestMode: Boolean? = false,
                @Json(name = "created")
                var created: Double? = 0.0,
                @Json(name = "created_utc")
                var createdUtc: Double? = 0.0,
                @Json(name = "discussion_type")
                var discussionType: Any? = Any(),
                @Json(name = "distinguished")
                var distinguished: Any? = Any(),
                @Json(name = "domain")
                var domain: String? = "",
                @Json(name = "downs")
                var downs: Int? = 0,
                @Json(name = "edited")
                var edited: Any? = Any(),
                @Json(name = "gallery_data")
                var galleryData: GalleryData? = GalleryData(),
                @Json(name = "gilded")
                var gilded: Int? = 0,
                @Json(name = "gildings")
                var gildings: Gildings? = Gildings(),
                @Json(name = "hidden")
                var hidden: Boolean? = false,
                @Json(name = "hide_score")
                var hideScore: Boolean? = false,
                @Json(name = "id")
                var id: String? = "",
                @Json(name = "is_created_from_ads_ui")
                var isCreatedFromAdsUi: Boolean? = false,
                @Json(name = "is_crosspostable")
                var isCrosspostable: Boolean? = false,
                @Json(name = "is_gallery")
                var isGallery: Boolean? = false,
                @Json(name = "is_meta")
                var isMeta: Boolean? = false,
                @Json(name = "is_original_content")
                var isOriginalContent: Boolean? = false,
                @Json(name = "is_reddit_media_domain")
                var isRedditMediaDomain: Boolean? = false,
                @Json(name = "is_robot_indexable")
                var isRobotIndexable: Boolean? = false,
                @Json(name = "is_self")
                var isSelf: Boolean? = false,
                @Json(name = "is_video")
                var isVideo: Boolean? = false,
                @Json(name = "likes")
                var likes: Any? = Any(),
                @Json(name = "link_flair_background_color")
                var linkFlairBackgroundColor: String? = "",
                @Json(name = "link_flair_css_class")
                var linkFlairCssClass: String? = "",
                @Json(name = "link_flair_richtext")
                var linkFlairRichtext: List<LinkFlairRichtext?>? = listOf(),
                @Json(name = "link_flair_template_id")
                var linkFlairTemplateId: String? = "",
                @Json(name = "link_flair_text")
                var linkFlairText: String? = "",
                @Json(name = "link_flair_text_color")
                var linkFlairTextColor: String? = "",
                @Json(name = "link_flair_type")
                var linkFlairType: String? = "",
                @Json(name = "locked")
                var locked: Boolean? = false,
                @Json(name = "media")
                var media: Any? = Any(),
                @Json(name = "media_embed")
                var mediaEmbed: MediaEmbed? = MediaEmbed(),
                @Json(name = "media_metadata")
                var mediaMetadata: MediaMetadata? = MediaMetadata(),
                @Json(name = "media_only")
                var mediaOnly: Boolean? = false,
                @Json(name = "mod_note")
                var modNote: Any? = Any(),
                @Json(name = "mod_reason_by")
                var modReasonBy: Any? = Any(),
                @Json(name = "mod_reason_title")
                var modReasonTitle: Any? = Any(),
                @Json(name = "mod_reports")
                var modReports: List<Any?>? = listOf(),
                @Json(name = "name")
                var name: String? = "",
                @Json(name = "no_follow")
                var noFollow: Boolean? = false,
                @Json(name = "num_comments")
                var numComments: Int? = 0,
                @Json(name = "num_crossposts")
                var numCrossposts: Int? = 0,
                @Json(name = "num_reports")
                var numReports: Any? = Any(),
                @Json(name = "over_18")
                var over18: Boolean? = false,
                @Json(name = "parent_whitelist_status")
                var parentWhitelistStatus: String? = "",
                @Json(name = "permalink")
                var permalink: String? = "",
                @Json(name = "pinned")
                var pinned: Boolean? = false,
                @Json(name = "post_hint")
                var postHint: String? = "",
                @Json(name = "preview")
                var preview: Preview? = Preview(),
                @Json(name = "pwls")
                var pwls: Int? = 0,
                @Json(name = "quarantine")
                var quarantine: Boolean? = false,
                @Json(name = "removal_reason")
                var removalReason: Any? = Any(),
                @Json(name = "removed_by")
                var removedBy: Any? = Any(),
                @Json(name = "removed_by_category")
                var removedByCategory: Any? = Any(),
                @Json(name = "report_reasons")
                var reportReasons: Any? = Any(),
                @Json(name = "saved")
                var saved: Boolean? = false,
                @Json(name = "score")
                var score: Int? = 0,
                @Json(name = "secure_media")
                var secureMedia: Any? = Any(),
                @Json(name = "secure_media_embed")
                var secureMediaEmbed: SecureMediaEmbed? = SecureMediaEmbed(),
                @Json(name = "selftext")
                var selftext: String? = "",
                @Json(name = "selftext_html")
                var selftextHtml: Any? = Any(),
                @Json(name = "send_replies")
                var sendReplies: Boolean? = false,
                @Json(name = "spoiler")
                var spoiler: Boolean? = false,
                @Json(name = "stickied")
                var stickied: Boolean? = false,
                @Json(name = "subreddit")
                var subreddit: String? = "",
                @Json(name = "subreddit_id")
                var subredditId: String? = "",
                @Json(name = "subreddit_name_prefixed")
                var subredditNamePrefixed: String? = "",
                @Json(name = "subreddit_subscribers")
                var subredditSubscribers: Int? = 0,
                @Json(name = "subreddit_type")
                var subredditType: String? = "",
                @Json(name = "suggested_sort")
                var suggestedSort: Any? = Any(),
                @Json(name = "thumbnail")
                var thumbnail: String? = "",
                @Json(name = "thumbnail_height")
                var thumbnailHeight: Int? = 0,
                @Json(name = "thumbnail_width")
                var thumbnailWidth: Int? = 0,
                @Json(name = "title")
                var title: String? = "",
                @Json(name = "top_awarded_type")
                var topAwardedType: Any? = Any(),
                @Json(name = "total_awards_received")
                var totalAwardsReceived: Int? = 0,
                @Json(name = "treatment_tags")
                var treatmentTags: List<Any?>? = listOf(),
                @Json(name = "ups")
                var ups: Int? = 0,
                @Json(name = "upvote_ratio")
                var upvoteRatio: Double? = 0.0,
                @Json(name = "url")
                var url: String? = "",
                @Json(name = "url_overridden_by_dest")
                var urlOverriddenByDest: String? = "",
                @Json(name = "user_reports")
                var userReports: List<Any?>? = listOf(),
                @Json(name = "view_count")
                var viewCount: Any? = Any(),
                @Json(name = "visited")
                var visited: Boolean? = false,
                @Json(name = "whitelist_status")
                var whitelistStatus: String? = "",
                @Json(name = "wls")
                var wls: Int? = 0
            ) {
                @JsonClass(generateAdapter = true)
                data class AllAwarding(
                    @Json(name = "award_sub_type")
                    var awardSubType: String? = "",
                    @Json(name = "award_type")
                    var awardType: String? = "",
                    @Json(name = "awardings_required_to_grant_benefits")
                    var awardingsRequiredToGrantBenefits: Any? = Any(),
                    @Json(name = "coin_price")
                    var coinPrice: Int? = 0,
                    @Json(name = "coin_reward")
                    var coinReward: Int? = 0,
                    @Json(name = "count")
                    var count: Int? = 0,
                    @Json(name = "days_of_drip_extension")
                    var daysOfDripExtension: Int? = 0,
                    @Json(name = "days_of_premium")
                    var daysOfPremium: Int? = 0,
                    @Json(name = "description")
                    var description: String? = "",
                    @Json(name = "end_date")
                    var endDate: Any? = Any(),
                    @Json(name = "giver_coin_reward")
                    var giverCoinReward: Any? = Any(),
                    @Json(name = "icon_format")
                    var iconFormat: String? = "",
                    @Json(name = "icon_height")
                    var iconHeight: Int? = 0,
                    @Json(name = "icon_url")
                    var iconUrl: String? = "",
                    @Json(name = "icon_width")
                    var iconWidth: Int? = 0,
                    @Json(name = "id")
                    var id: String? = "",
                    @Json(name = "is_enabled")
                    var isEnabled: Boolean? = false,
                    @Json(name = "is_new")
                    var isNew: Boolean? = false,
                    @Json(name = "name")
                    var name: String? = "",
                    @Json(name = "penny_donate")
                    var pennyDonate: Any? = Any(),
                    @Json(name = "penny_price")
                    var pennyPrice: Any? = Any(),
                    @Json(name = "resized_icons")
                    var resizedIcons: List<ResizedIcon?>? = listOf(),
                    @Json(name = "resized_static_icons")
                    var resizedStaticIcons: List<ResizedStaticIcon?>? = listOf(),
                    @Json(name = "start_date")
                    var startDate: Any? = Any(),
                    @Json(name = "static_icon_height")
                    var staticIconHeight: Int? = 0,
                    @Json(name = "static_icon_url")
                    var staticIconUrl: String? = "",
                    @Json(name = "static_icon_width")
                    var staticIconWidth: Int? = 0,
                    @Json(name = "subreddit_coin_reward")
                    var subredditCoinReward: Int? = 0,
                    @Json(name = "subreddit_id")
                    var subredditId: Any? = Any(),
                    @Json(name = "tiers_by_required_awardings")
                    var tiersByRequiredAwardings: Any? = Any()
                ) {
                    @JsonClass(generateAdapter = true)
                    data class ResizedIcon(
                        @Json(name = "height")
                        var height: Int? = 0,
                        @Json(name = "url")
                        var url: String? = "",
                        @Json(name = "width")
                        var width: Int? = 0
                    )

                    @JsonClass(generateAdapter = true)
                    data class ResizedStaticIcon(
                        @Json(name = "height")
                        var height: Int? = 0,
                        @Json(name = "url")
                        var url: String? = "",
                        @Json(name = "width")
                        var width: Int? = 0
                    )
                }

                @JsonClass(generateAdapter = true)
                data class AuthorFlairRichtext(
                    @Json(name = "a")
                    var a: String? = "",
                    @Json(name = "e")
                    var e: String? = "",
                    @Json(name = "t")
                    var t: String? = "",
                    @Json(name = "u")
                    var u: String? = ""
                )

                @JsonClass(generateAdapter = true)
                data class GalleryData(
                    @Json(name = "items")
                    var items: List<Item?>? = listOf()
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Item(
                        @Json(name = "id")
                        var id: Int? = 0,
                        @Json(name = "media_id")
                        var mediaId: String? = ""
                    )
                }

                @JsonClass(generateAdapter = true)
                data class Gildings(
                    @Json(name = "gid_1")
                    var gid1: Int? = 0,
                    @Json(name = "gid_2")
                    var gid2: Int? = 0
                )

                @JsonClass(generateAdapter = true)
                data class LinkFlairRichtext(
                    @Json(name = "a")
                    var a: String? = "",
                    @Json(name = "e")
                    var e: String? = "",
                    @Json(name = "t")
                    var t: String? = "",
                    @Json(name = "u")
                    var u: String? = ""
                )

                @JsonClass(generateAdapter = true)
                class MediaEmbed(
                )

                @JsonClass(generateAdapter = true)
                data class MediaMetadata(
                    @Json(name = "air38f18trl71")
                    var air38f18trl71: Air38f18trl71? = Air38f18trl71(),
                    @Json(name = "ay8cge18trl71")
                    var ay8cge18trl71: Ay8cge18trl71? = Ay8cge18trl71(),
                    @Json(name = "57j25f18trl71")
                    var j25f18trl71: J25f18trl71? = J25f18trl71(),
                    @Json(name = "q8xzme18trl71")
                    var q8xzme18trl71: Q8xzme18trl71? = Q8xzme18trl71(),
                    @Json(name = "823ube18trl71")
                    var ube18trl71: Ube18trl71? = Ube18trl71(),
                    @Json(name = "5volzd18trl71")
                    var volzd18trl71: Volzd18trl71? = Volzd18trl71(),
                    @Json(name = "zv5eae18trl71")
                    var zv5eae18trl71: Zv5eae18trl71? = Zv5eae18trl71()
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Air38f18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class Ay8cge18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class J25f18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class Q8xzme18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class Ube18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class Volzd18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }

                    @JsonClass(generateAdapter = true)
                    data class Zv5eae18trl71(
                        @Json(name = "e")
                        var e: String? = "",
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "m")
                        var m: String? = "",
                        @Json(name = "p")
                        var p: List<P?>? = listOf(),
                        @Json(name = "s")
                        var s: S? = S(),
                        @Json(name = "status")
                        var status: String? = ""
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class P(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class S(
                            @Json(name = "u")
                            var u: String? = "",
                            @Json(name = "x")
                            var x: Int? = 0,
                            @Json(name = "y")
                            var y: Int? = 0
                        )
                    }
                }

                @JsonClass(generateAdapter = true)
                data class Preview(
                    @Json(name = "enabled")
                    var enabled: Boolean? = false,
                    @Json(name = "images")
                    var images: List<Image?>? = listOf()
                ) {
                    @JsonClass(generateAdapter = true)
                    data class Image(
                        @Json(name = "id")
                        var id: String? = "",
                        @Json(name = "resolutions")
                        var resolutions: List<Resolution?>? = listOf(),
                        @Json(name = "source")
                        var source: Source? = Source(),
                        @Json(name = "variants")
                        var variants: Variants? = Variants()
                    ) {
                        @JsonClass(generateAdapter = true)
                        data class Resolution(
                            @Json(name = "height")
                            var height: Int? = 0,
                            @Json(name = "url")
                            var url: String? = "",
                            @Json(name = "width")
                            var width: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class Source(
                            @Json(name = "height")
                            var height: Int? = 0,
                            @Json(name = "url")
                            var url: String? = "",
                            @Json(name = "width")
                            var width: Int? = 0
                        )

                        @JsonClass(generateAdapter = true)
                        data class Variants(
                            @Json(name = "nsfw")
                            var nsfw: Nsfw? = Nsfw(),
                            @Json(name = "obfuscated")
                            var obfuscated: Obfuscated? = Obfuscated()
                        ) {
                            @JsonClass(generateAdapter = true)
                            data class Nsfw(
                                @Json(name = "resolutions")
                                var resolutions: List<Resolution?>? = listOf(),
                                @Json(name = "source")
                                var source: Source? = Source()
                            ) {
                                @JsonClass(generateAdapter = true)
                                data class Resolution(
                                    @Json(name = "height")
                                    var height: Int? = 0,
                                    @Json(name = "url")
                                    var url: String? = "",
                                    @Json(name = "width")
                                    var width: Int? = 0
                                )

                                @JsonClass(generateAdapter = true)
                                data class Source(
                                    @Json(name = "height")
                                    var height: Int? = 0,
                                    @Json(name = "url")
                                    var url: String? = "",
                                    @Json(name = "width")
                                    var width: Int? = 0
                                )
                            }

                            @JsonClass(generateAdapter = true)
                            data class Obfuscated(
                                @Json(name = "resolutions")
                                var resolutions: List<Resolution?>? = listOf(),
                                @Json(name = "source")
                                var source: Source? = Source()
                            ) {
                                @JsonClass(generateAdapter = true)
                                data class Resolution(
                                    @Json(name = "height")
                                    var height: Int? = 0,
                                    @Json(name = "url")
                                    var url: String? = "",
                                    @Json(name = "width")
                                    var width: Int? = 0
                                )

                                @JsonClass(generateAdapter = true)
                                data class Source(
                                    @Json(name = "height")
                                    var height: Int? = 0,
                                    @Json(name = "url")
                                    var url: String? = "",
                                    @Json(name = "width")
                                    var width: Int? = 0
                                )
                            }
                        }
                    }
                }

                @JsonClass(generateAdapter = true)
                class SecureMediaEmbed(
                )
            }
        }
    }
}