//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.
package Swing_programs;

import java.util.HashMap;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListCapitalExample extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public JListCapitalExample() {

        // Create country-capital map
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Country list
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        countryList = new JList<>(countries);

        // Add listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    String capital = capitalMap.get(selectedCountry);

                    System.out.println("Capital of " + selectedCountry + " is: " + capital);
                }
            }
        });

        add(new JScrollPane(countryList));

        setTitle("Country Capital List");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListCapitalExample();
    }
}
