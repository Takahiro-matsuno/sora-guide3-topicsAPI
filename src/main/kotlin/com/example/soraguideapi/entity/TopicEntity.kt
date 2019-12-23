package com.example.soraguideapi.entity

import javax.persistence.*

@Entity
@Table(name = "topic")
data class TopicEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "topic_id", nullable = false, unique = true)
        val topicId: Long = -1,

        @Column(name = "topic_name", nullable = false, unique = false)
        val topicName: String = "",

        @Column(name = "topic_image", nullable = false, unique = true)
        val topicImage: String = "",

        @Column(name = "topic_url", nullable = false, unique = false)
        val topicUrl: String = "",

        @Column(name = "display", nullable = false, unique = false)
        val display: Long = -1
)