package br.com.githubapi.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetUserResponse(
    @SerialName("login") val login: String,
    @SerialName("id") val id: Long,
    @SerialName("node_id") val nodeId: String,
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("gravatar_id") val gravatarId: String? = null,
    @SerialName("url") val url: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("followers_url") val followersUrl: String,
    @SerialName("following_url") val followingUrl: String,
    @SerialName("gists_url") val gistsUrl: String,
    @SerialName("starred_url") val starredUrl: String,
    @SerialName("subscriptions_url") val subscriptionsUrl: String,
    @SerialName("organizations_url") val organizationsUrl: String,
    @SerialName("repos_url") val reposUrl: String,
    @SerialName("events_url") val eventsUrl: String,
    @SerialName("received_events_url") val receivedEventsUrl: String,
    @SerialName("type") val type: String,
    @SerialName("site_admin") val siteAdmin: Boolean,
    @SerialName("name") val name: String? = null,
    @SerialName("company") val company: String? = null,
    @SerialName("blog") val blog: String? = null,
    @SerialName("location") val location: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("hireable") val hireable: Boolean? = null,
    @SerialName("bio") val bio: String? = null,
    @SerialName("twitter_username") val twitterUsername: String? = null,
    @SerialName("public_repos") val publicRepos: Int,
    @SerialName("public_gists") val publicGists: Int,
    @SerialName("followers") val followers: Int,
    @SerialName("following") val following: Int,
    @SerialName("created_at") val createdAt: String,
    @SerialName("updated_at") val updatedAt: String,
    @SerialName("plan") val plan: Plan? = null,
    @SerialName("suspended_at") val suspendedAt: String? = null,
    @SerialName("private_gists") val privateGists: Int? = null,
    @SerialName("total_private_repos") val totalPrivateRepos: Int? = null,
    @SerialName("owned_private_repos") val ownedPrivateRepos: Int? = null,
    @SerialName("disk_usage") val diskUsage: Int? = null,
    @SerialName("collaborators") val collaborators: Int? = null
)

@Serializable
data class Plan(
    @SerialName("collaborators") val collaborators: Int = 0,
    @SerialName("name") val name: String = "",
    @SerialName("space") val space: Int = 0,
    @SerialName("private_repos") val privateRepos: Int = 0
)