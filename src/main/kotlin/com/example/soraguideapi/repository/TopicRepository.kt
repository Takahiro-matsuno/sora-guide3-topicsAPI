package com.example.soraguideapi.repository

import com.example.soraguideapi.entity.TopicEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicRepository: JpaRepository<TopicEntity,String>