/**
 * Revision history【修正履歴】
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito  小川    新規追加
 */

package com.example.soraguideapi.entity

/**
 * Entity : Topic会員および家族の有効マイルクラス。
 * @author  JIT ShotaSaito小川
 * @version 1.0.0
 */
data class Topic (val topic_id: Integer,val topic_title: String, val topic_content: String, val topic_image: String, val display: Integer)