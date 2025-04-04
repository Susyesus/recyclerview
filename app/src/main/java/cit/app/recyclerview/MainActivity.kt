package cit.app.recyclerview

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cit.app.recyclerview.data.Employee
import cit.app.recyclerview.helper.EmployeeRecyclerViewAdapter

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.recyclerview)
        val listOfEmployee = listOf(
            Employee("emp1","Susye","Yer","Soona",R.drawable.android),
            Employee("emp2","Uvuvwe","Vwevwe","Unyetenyevwe",R.drawable.android),
            Employee("emp3","Ugwem","Mugwem","Ossas",R.drawable.android),
            Employee("emp4","Pneumono","Ultra","Microscopic",R.drawable.android),
            Employee("emp5","Silico","Volcano","Coniosis",R.drawable.android),
            Employee("emp6","Super","Califragilistic","Expialidocious",R.drawable.android),
            Employee("emp7","Elias","Zar","Soot",R.drawable.android),
            Employee("emp8","Sha","Con","Eta",R.drawable.android),
            Employee("emp9","Mama","Mary","Nazareth",R.drawable.android)

        )
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = EmployeeRecyclerViewAdapter(listOfEmployee)

    }
}