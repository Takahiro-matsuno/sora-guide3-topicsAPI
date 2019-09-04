/**
 * Revision history【修正履歴】
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito  小川    新規追加
 */

package com.example.soraguideapi.controller

import com.example.soraguideapi.entity.Topic
import com.example.soraguideapi.service.TopicsGetService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity

/**
 * Controller : Controller会
 * @author  JIT ShotaSaito小川
 * @version 1.0.0
 */
@Controller
//Default URL
@RequestMapping("index")
class Controller {

    //Initialize TopicsGetService
    @Autowired
    var topicsGetService: TopicsGetService? = null

    //API Request URL:/api/topics
    @RequestMapping("/getAllTopics")

    //Get All Topics
    fun api_index(): ResponseEntity<List<Topic>> {

        //Call TopicsGetService
        val res = topicsGetService!!.findAll()

        //Return All Topics : List<Topic>
        return ResponseEntity.ok(res)
    }
}