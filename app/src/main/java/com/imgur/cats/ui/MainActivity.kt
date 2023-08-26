package com.imgur.cats.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imgur.cats.databinding.ActivityMainBinding
import com.imgur.cats.utils.AUTHORIZATION_HEADER
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        recyclerView = binding.catsRecyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 4)

        viewModel.onSuccessGetCats.observe(this) {
            val catsAdapter = CatsAdapter(viewModel.mediaItems)
            recyclerView.adapter = catsAdapter
        }

        CoroutineScope(Dispatchers.IO).launch {
            viewModel.getCats("cats", AUTHORIZATION_HEADER)
        }
    }
}