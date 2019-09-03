/**
 * Revision history【修正履歴】
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito  小川    新規追加
 */

package com.example.soraguideapi.mapper

import com.example.soraguideapi.entity.Topic
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * Mapper : SQL associated with processingよび家族の有効マイルクラス。
 * @author  JIT ShotaSaito小川
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