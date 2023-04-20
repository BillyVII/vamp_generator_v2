package com.example.vamp_generator_v2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vamp_generator_v2.databinding.ConceptListRowBinding

class ConceptAdapter :
    RecyclerView.Adapter<ConceptAdapter.ConceptViewHolder>() {
    private lateinit var binding: ConceptListRowBinding
    private var conceptList: List<String> = listOf(
        "Artiste",
        "Clerc",
        "Criminel",
        "Enfant",
        "Intellectuel",
        "Investigateur",
        "Marginal",
        "Politicien",
        "Soldat",
        "Travailleur",
        "Vagabond"
    )
    class ConceptViewHolder(private val binding: ConceptListRowBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(concept: String){
            binding.listItem.text = concept.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConceptViewHolder {
        binding = ConceptListRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ConceptViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return conceptList.size
    }

    override fun onBindViewHolder(holder: ConceptViewHolder, position: Int) {
        val concept = conceptList[position]
        holder.bind(concept)


    }
}