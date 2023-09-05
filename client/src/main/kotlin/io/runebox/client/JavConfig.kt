package io.runebox.client

import java.net.URL

class JavConfig private constructor(private val params: HashMap<String, String> = hashMapOf()) : Map<String, String> by params {

    companion object {
        fun load(url: String = "http://oldschool1.runescape.com/jav_config.ws"): JavConfig {
            val params = hashMapOf<String, String>()
            val lines = URL(url).readText().split("\n")
            lines.forEach {
                var line = it
                if(line.startsWith("param=")) {
                    line = line.substring(6)
                }
                val idx = line.indexOf("=")
                if(idx >= 0) {
                    params[line.substring(0, idx)] = line.substring(idx + 1)
                }
            }
            return JavConfig(params)
        }
    }
}