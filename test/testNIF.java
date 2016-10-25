/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import activitat2_2_m5_uf2.Nif;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class testNIF {
    
    public testNIF() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //Test NIF

    
    //Test de NIF que dara Nif vàlid porque es correcto el DNI.
    @Test
    public final void testnif1() {
        //fail ("Sin implementar");
        
        assertEquals( "Nif Vàlid", Nif.esValid("53654505J"));
    }
    
    
    //Test de NIF que dara Nif invàlid perquè la lletra està malament.
    @Test
    public final void testnif2() {
        //fail ("Sin implementar");
        
        assertEquals( "Nif Invàlid", Nif.esValid("53654505A"));
    }
    
    
    
    //Test de NIF que dara Format Incorrecte perquè el DNI esta mal introduit.
    @Test
    public final void testnif3() {
        //fail ("Sin implementar");
        
        assertEquals( "Format Incorrecte", Nif.esValid("53AEU505A"));
    }
    
    
    
    
    //Test de NIF que dara Format Incorrecte perquè el DNI no te la longitud correcte.
    @Test
    public final void testnif4() {
        //fail ("Sin implementar");
        
        assertEquals( "Format Incorrecte", Nif.esValid("53505A"));
    }
}
