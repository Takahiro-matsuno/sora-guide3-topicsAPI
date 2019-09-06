/**
 * Revision history
 * --------------------------------------------------
 * Date        Version    Name            Comments
 * --------------------------------------------------
 * 2019/09/03    1.0.0    ShotaSaito
 */

package com.example.soraguideapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * SpringBoot Settings
 * @author  JIT ShotaSaito
 * @version 1.0.0
 */

@SpringBootApplication
class SoraguideapiApplication

//Main Method
fun main(args: Array<String>) {
	//RUN SpringBoot
	runApplication<SoraguideapiApplication>(*args)
}
