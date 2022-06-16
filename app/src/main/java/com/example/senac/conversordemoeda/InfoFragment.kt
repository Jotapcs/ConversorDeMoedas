package com.example.senac.conversordemoeda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class InfoFragment : Fragment() {

    private lateinit var result: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        val spinner = view.findViewById<Spinner>(R.id.spinner_moedas)
        val edit_field = view.findViewById<EditText>(R.id.edit_field)
        val itens = arrayOf("Selecione", "Real", "Dolar", "Libras Esterlina", "Euro", "Franco Suiço", "Iene", "Peso Argentino")

        result = view.findViewById<TextView>(R.id.txt_result)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, itens)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var moeda = 0.0

                if (p2 == 1) {
                    moeda = 1.0
                } else if (p2 == 2) {
                    moeda = 5.12
                } else if (p2 == 3) {
                    moeda = 6.14
                } else if (p2 == 4) {
                    moeda = 5.33
                } else if (p2 == 5) {
                    moeda = 5.11
                } else if (p2 == 6) {
                    moeda = 0.038
                } else if (p2 == 7) {
                    moeda = 0.042
                }

                result.text = "R$" + moeda.toString()
                result.visibility = View.VISIBLE
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        return view
    }
}
