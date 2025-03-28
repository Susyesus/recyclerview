package cit.app.recyclerview.helper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cit.app.recyclerview.R
import cit.app.recyclerview.data.Employee

class EmployeeRecyclerViewAdapter(private val listOfEmployees: List<Employee>)
    : RecyclerView.Adapter<EmployeeRecyclerViewAdapter.ItemViewHolder>() {

        class ItemViewHolder (view: View) : RecyclerView.ViewHolder(view){
            val photo = view.findViewById<ImageView>(R.id.imageview_profile_pic)
            val employeeid = view.findViewById<TextView>(R.id.textview_id)
            val firstname = view.findViewById<TextView>(R.id.textview_firstname)
            val middlename = view.findViewById<TextView>(R.id.textview_middlename)
            val lastname = view.findViewById<TextView>(R.id.textview_lastname)

        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EmployeeRecyclerViewAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: EmployeeRecyclerViewAdapter.ItemViewHolder,
        position: Int
    ) {
    }

    override fun getItemCount(): Int = listOfEmployees.size
}