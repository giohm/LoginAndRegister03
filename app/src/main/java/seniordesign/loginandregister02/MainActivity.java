package seniordesign.loginandregister02;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LoginFragment loginFragment = new LoginFragment();
//        RegisterFragment registerFragment = new RegisterFragment();
        fragmentTransaction.add(R.id.fragment_container, loginFragment);
//        fragmentTransaction.add(R.id.fragment_container, registerFragment);
        fragmentTransaction.commit();
    }

}
