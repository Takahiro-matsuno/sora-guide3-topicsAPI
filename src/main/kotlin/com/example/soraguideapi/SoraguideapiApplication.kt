/**
 * Revision history【修正履歴】
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito  小川    新規追加
 */

package com.example.soraguideapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * SpringBoot Settings会員および家族の有効マイルクラス。
 * @author  JIT ShotaSaito小川
 * @version 1.0.0
 */

@SpringBootApplication
class SoraguideapiApplication

//Main Method
fun main(args: Array<String>) {
	//RUN SpringBoot
	runApplication<SoraguideapiApplication>(*args)
}
