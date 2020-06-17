package in.virtu.jolly;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import in.virtu.jolly.ui.dashboard.DashboardFragment;
import in.virtu.jolly.ui.home.HomeFragment;
import in.virtu.jolly.ui.notifications.NotificationsFragment;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_wishlist, R.id.navigation_cart,R.id.navigation_account)
                .build();
        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

         }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        FragmentManager fragmentManager =getSupportFragmentManager();
        if(id==R.id.navigation_home)
        {
            Toast.makeText(getApplicationContext(),"asdsfc",Toast.LENGTH_SHORT).show();
            fragmentManager.beginTransaction().replace(R.id.container,new HomeFragment()).commit();
        }
        if(id==R.id.navigation_wishlist)
        {
            Toast.makeText(getApplicationContext(),"asdsfc",Toast.LENGTH_SHORT).show();
            fragmentManager.beginTransaction().replace(R.id.container,new DashboardFragment()).commit();
        }

        if(id==R.id.navigation_cart)
        {
            Toast.makeText(getApplicationContext(),"asdsfc",Toast.LENGTH_SHORT).show();
            fragmentManager.beginTransaction().replace(R.id.container,new NotificationsFragment()).commit();
        }



        return false;
    }
}




