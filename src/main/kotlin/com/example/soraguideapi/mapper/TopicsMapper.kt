/**
 * Revision history
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito
 */

package com.example.soraguideapi.mapper

import com.example.soraguideapi.entity.Topic
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * Mapper : SQL associated with processing
 * @author  JIT ShotaSaito
 * @version 1.0.0
 */

@Mapper
interface TopicsMapper {

    //SELECT ALL
    @Select("SELECT * FROM topics WHERE display = 0 order by topic_id")
    fun findAll(): List<Topic>

    //FILTERED SEARCH : topic_id
    @Select("SELECT * FROM topics WHERE display = 0 AND topic_id = #{id}")
    fun findById(@Param("id") id: Int?): Topic

}