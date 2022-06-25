package com.example.weatherapi.presentation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapi.R
import com.example.weatherapi.databinding.ActivityMainBinding
import com.example.weatherapi.presentation.fragments.MainFragment

const val API_KEY = "9eab5f0cdb974c26bd8173905222306"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, MainFragment.newInstance())
            .commit()

//        binding.button.setOnClickListener {
//            getResult(name = "Moscov")
//        }
    }

//    private fun getResult(name: String) {
//        val url = "https://api.weatherapi.com/v1/current.json?key=$API_KEY&q=$name&aqi=no"
//        val queue = Volley.newRequestQueue(this)
//        val request = StringRequest(Request.Method.GET, url,
//            {
//                val obj = JSONObject(it)
//                val current = obj.getJSONObject("current")
//                val temp = current.getString("temp_c")
//                Log.d("MyLog", "Response $temp")
//            },
//            {
//                Log.d("MyLog", "Volley error $it")
//            }
//        )
//        queue.add(request)
//    }
}