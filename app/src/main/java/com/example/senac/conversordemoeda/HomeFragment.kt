package com.example.senac.conversordemoeda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.senac.conversordemoeda.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeBinding: FragmentHomeBinding
    private lateinit var result: TextView
    private lateinit var editField: TextView
    private var brl: Boolean = false
    private var usd: Boolean = false
    private var libra: Boolean = false
    private var eur: Boolean = false
    private var sfr: Boolean = false
    private var iene: Boolean = false
    private var peso: Boolean = false
    private var value: Float = 0.0F

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = homeBinding.root
        val spinner = homeBinding.spinnerMoedas
        val spinner2 = homeBinding.spinnerMoedas2
        val itens = arrayOf("Selecione", "Real", "Dolar", "Libras Esterlina", "Euro", "Franco Suiço", "Iene", "Peso Argentino")
        editField = homeBinding.editField

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, itens)
        spinner.adapter = adapter

        val adapter2 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, itens)
        spinner2.adapter = adapter2

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                if (p2 == 1) {
                    brl = true
                    usd = false
                    eur = false
                    libra = false
                    sfr = false
                    iene = false
                } else if (p2 == 2) {
                    usd = true
                    libra = false
                    eur = false
                    brl = false
                    sfr = false
                    iene = false
                } else if (p2 == 3) {
                    libra = true
                    usd = false
                    eur = false
                    brl = false
                    sfr = false
                    iene = false
                } else if (p2 == 4) {
                    eur = true
                    libra = false
                    usd = false
                    brl = false
                    sfr = false
                    iene = false

                } else if (p2 == 5){
                    sfr = true
                    eur = false
                    libra = false
                    usd = false
                    brl = false
                    iene = false
                } else if(p2 == 6){
                    iene = true
                    sfr = false
                    eur = false
                    libra = false
                    usd = false
                    brl = false
                    peso = false
                } else if(p2 == 7){
                    peso = true
                    iene = false
                    sfr = false
                    eur = false
                    libra = false
                    usd = false
                    brl = false
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                if (p2 == 1)
                    converterBRL()
                else if (p2 == 2)
                    converterUSD()
                else if (p2 == 3)
                    converterLIBRA()
                else if (p2 == 4)
                    converterEUR()
                else if (p2 == 5)
                    converterSFR()
                else if (p2 == 6)
                    converterIENE()
                else if (p2 == 7)
                    converterPESO()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        return view
    }

    private fun converterBRL() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 0.195).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.162).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 0.187).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 0.1956).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 26.31).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 23.80).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterUSD() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 5.12).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.83).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 0.96).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 1.001).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 134.73).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 121.90).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterLIBRA() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 6.14).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 1.19).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 1.15).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 1.20).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 161.57).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 146.19).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterEUR() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 5.33).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 1.04).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.86).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 1.04).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 140.26).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 126.90).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterSFR() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 5.11).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 0.99).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.828).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 0.95).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 134.47).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 121.66).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterIENE() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 0.038).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 0.0075).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.0061).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 0.0072).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 0.0074).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 0.90).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }

    private fun converterPESO() {
        if (brl) {
            value = (editField.text.toString().toFloat() * 0.042).toFloat()
        } else if (usd) {
            value = (editField.text.toString().toFloat() * 0.0082).toFloat()
        } else if (libra) {
            value = (editField.text.toString().toFloat() * 0.0067).toFloat()
        } else if (eur) {
            value = (editField.text.toString().toFloat() * 0.0078).toFloat()
        } else if (sfr) {
            value = (editField.text.toString().toFloat() * 0.0081).toFloat()
        } else if (iene) {
            value = (editField.text.toString().toFloat() * 1.09).toFloat()
        } else if (peso) {
            value = (editField.text.toString().toFloat() * 1.0).toFloat()
        }

        homeBinding.txtResult.setText(value.toString())
        homeBinding.txtResult.visibility = View.VISIBLE
    }
}




