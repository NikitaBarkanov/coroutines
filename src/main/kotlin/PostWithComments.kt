data class PostWithComments(
    val post: Post,
    val comments: List<Comment>,
)

data class PostAuthor(
    val id: Long,
    val post: List<Author>
)

data class PostWithCommentsAndAuthors(
    val post: Post,
    val comments: List<Comment>,
    val author: Author
)