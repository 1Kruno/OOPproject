/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package housingapp;

/**
 *
 * @author x18100252
 */
public class Housing {
    
    int Value;
   
    //area,2 bed house, 3 bed house, 4 bed house
    int[][] HousePrice = {   {1, 1923, 2399, 2966},
                               {2, 2193, 2606, 3102},
                               {3, 1832, 2129, 2434},
                               {4, 2244, 2571, 2878},
                               {5, 1644, 1923, 2117},
                               {6, 2040, 2386, 2627},
                               {61, 1807, 2114, 2327},
                               {7, 1781, 2083, 2294},
                               {8, 1874, 2191, 2413},
                               {9, 1658, 1939, 2135},
                               {10, 1526, 1785, 1965},
                               {11, 1551, 1814, 1997},
                               {12, 1637, 1915, 2108},
                               {13, 1620, 1895, 2086},
                               {14, 1788, 2092, 2303},
                               {15, 1504, 1759, 1936},
                               {16, 1633, 1910, 2103},
                               {17, 1558, 1823, 2007},
                               {18, 1809, 2115, 2329},
                               {20, 1631, 1907, 2100},
                               {22, 1473, 1723, 1897},
                               {24, 1507, 1763, 1941},
            
        
    };
    
    //area,1 bed apartment,2  bed apartment, 3 bed apartment
    int[][] ApartmentPrice = { {1, 1585, 1895, 2300},
                               {2, 1834, 2250, 2602},
                               {3, 1553, 1850, 2034},
                               {4, 1981, 2383, 2778},
                               {5, 1426, 1623, 1917},
                               {6, 1770, 1886, 2127},
                               {61, 1567, 1814, 2027},
                               {7, 1545, 1783, 1994},
                               {8, 1625, 1891, 2013},
                               {9, 1438, 1739, 1935},
                               {10, 1324, 1585, 1965},
                               {11, 1345, 1414, 1797},
                               {12, 1420, 1615, 1808},
                               {13, 1405, 1595, 1886},
                               {14, 1551, 1792, 2003},
                               {15, 1304, 1659, 1936},
                               {16, 1416, 1710, 2003},
                               {17, 1352, 1523, 2007},
                               {18, 1569, 2015, 2329},
                               {20, 1414, 1707, 2100},
                               {22, 1278, 1523, 1897},
                               {24, 1307, 1663, 1939},
            
        
    };
    
    public int getValue(int Value){
        return Value;
    }
    
    public void displayValue(){
        for(int i=0;i<3;i++){
            System.out.println("The value of the property is "+ HousePrice[i][2]);
        }
    }
    
}
