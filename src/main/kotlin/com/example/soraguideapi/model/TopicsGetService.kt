
/**
 * Revision history
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito
 */

package com.example.soraguideapi.model
import com.example.soraguideapi.entity.TopicEntity
import com.example.soraguideapi.repository.TopicRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Service : TopicsGetService
 * @author  JIT ShotaSaito
 * @version 1.0.0
 */

@Service
@Transactional
class TopicsGetService(
        private val topicRepository:TopicRepository
) {

    //CALL findAll
    fun findAll(): List<TopicEntity> {
        return topicRepository.findAll()
    }

}
