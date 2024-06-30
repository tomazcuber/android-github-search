package br.com.githubapi.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit2.http.Url

//TODO: Add missing fields that are not 'required' in the API response
@Serializable
data class RepositoryResponse(
    @SerialName("archive_url") val archiveUrl: String,
    @SerialName("assignees_url") val assigneesUrl: String,
    @SerialName("blobs_url") val blobsUrl: String,
    @SerialName("branches_url") val branchesUrl: String,
    @SerialName("collaborators_url") val collaboratorsUrl: String,
    @SerialName("comments_url") val commentsUrl: String,
    @SerialName("commits_url") val commitsUrl: String,
    @SerialName("compare_url") val compareUrl: String,
    @SerialName("contents_url") val contentsUrl: String,
    @SerialName("contributors_url") val contributorsUrl: String,
    @SerialName("deployments_url") val deploymentsUrl: String,
    @SerialName("description") val description: String,
    @SerialName("downloads_url") val downloadsUrl: String,
    @SerialName("events_url") val eventsUrl: String,
    @SerialName("fork") val fork: Boolean,
    @SerialName("forks_url") val forksUrl: String,
    @SerialName("forks_count") val forksCount: Int,
    @SerialName("full_name") val fullName: String,
    @SerialName("owner") val owner: RepositoryOwner,
    @SerialName("git_commits_url") val gitCommitsUrl: String,
    @SerialName("git_refs_url") val gitRefsUrl: String,
    @SerialName("git_tags_url") val gitTagsUrl: String,
    @SerialName("hooks_url") val hooksUrl: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("id") val id: Long,
    @SerialName("node_id") val nodeId: String,
    @SerialName("issue_comment_url") val issueCommentUrl: String,
    @SerialName("issue_events_url") val issueEventsUrl: String,
    @SerialName("issues_url") val issuesUrl: String,
    @SerialName("keys_url") val keysUrl: String,
    @SerialName("languages_url") val languagesUrl: String,
    @SerialName("merges_url") val mergesUrl: String,
    @SerialName("milestones_url") val milestonesUrl: String,
    @SerialName("name") val name: String,
    @SerialName("notifications_url") val notificationsUrl: String,
    @SerialName("private") val private: Boolean,
    @SerialName("pulls_url") val pullsUrl: String,
    @SerialName("releases_url") val releasesUrl: String,
    @SerialName("stargazers_url") val stargazersUrl: String,
    @SerialName("stargazers_count") val stargazersCount: Int,
    @SerialName("statuses_url") val statusesUrl: String,
    @SerialName("subscribers_url") val subscribersUrl: String,
    @SerialName("subscription_url") val subscriptionUrl: String,
    @SerialName("tags_url") val tagsUrl: String,
    @SerialName("teams_url") val teamsUrl: String,
    @SerialName("trees_url") val treesUrl: String,
    @SerialName("url") val url: String,
)

@Serializable
data class RepositoryOwner(
    @SerialName("avatar_url") val avatarUrl: String,
    @SerialName("events_url") val eventsUrl: String,
    @SerialName("followers_url") val followersUrl: String,
    @SerialName("following_url") val followingUrl: String,
    @SerialName("gists_url") val gistsUrl: String,
    @SerialName("gravatar_id") val gravatarId: String,
    @SerialName("html_url") val htmlUrl: String,
    @SerialName("id") val id: Long,
    @SerialName("node_id") val nodeId: String,
    @SerialName("login") val login: String,
    @SerialName("organizations_url") val organizationsUrl: String,
    @SerialName("received_events_url") val receivedEventsUrl: String,
    @SerialName("repos_url") val reposUrl: String,
    @SerialName("site_admin") val siteAdmin: Boolean,
    @SerialName("starred_url") val starredUrl : String,
    @SerialName("subscriptions_url") val subscriptionsUrl: String,
    @SerialName("type") val type: String,
    @SerialName("url") val url: String
)
