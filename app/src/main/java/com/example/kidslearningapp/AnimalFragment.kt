package com.example.kidslearningapp

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnimalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnimalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var animal = intArrayOf(R.drawable.lion,R.drawable.cat,R.drawable.horse,R.drawable.elephant)
    var animal_nm = arrayOf("lion","cat","horse","elephant")
    var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_animal, container, false)
        //var animal = intArrayOf(R.drawable.a)
        var gv = v.findViewById<GridView>(R.id.gv)
        var iv = v.findViewById<ImageView>(R.id.imageView3)
        iv.setImageResource(animal[0])

        gv.adapter = ImageAdapter(v.context)
       // gv.numColumns = animal.size

        gv.setOnItemClickListener { adapterView, view, i, l ->
            var name = animal_nm[i]
            iv.setImageResource(animal[i])

            var mid =resources.getIdentifier("$name","raw",activity?.packageName)
            if(mp.isPlaying)
                mp.stop()

            mp = MediaPlayer.create(v.context,mid)
            mp.start()
        }
        return  v
    }

    inner class ImageAdapter(context:Context):BaseAdapter(){
        override fun getCount(): Int {
            return animal.size
        }

        override fun getItem(p0: Int): Any {
            return p0
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
       }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var iv = ImageView(context)
            iv.setImageResource(animal[p0])
            iv.layoutParams = ViewGroup.LayoutParams(200,200)
            return  iv
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AnimalFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AnimalFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}