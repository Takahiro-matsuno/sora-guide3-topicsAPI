
/**
 * Revision history
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito
 */

package com.example.soraguideapi.model
import com.example.soraguideapi.mapper.TopicsMapper
import com.example.soraguideapi.entity.Topic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Service : TopicsGetService
 * @author  JIT ShotaSaito
 * @version 1.0.0
 */

@Service
@Transactional
class TopicsGetService {

    //Initialize TopicsMapper
    @Autowired
    internal var topicsMapper: TopicsMapper? = null

    //CALL findAll
    fun findAll(): List<Topic> {
        return topicsMapper!!.findAll()
    }

}
