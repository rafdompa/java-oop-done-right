package org.javaoop.simplepointofsale.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BillTest {

    @Test
    public void totalAmountIsZero(){
        var bill = new Bill();
        float total = bill.getTotal();
        assertThat(total).isZero();
    }

    @Test
    public void correctTotalForOneItem(){
        var bill = new Bill();
        bill.add(12.95f);
        float total = bill.getTotal();

        assertThat(total).isEqualTo(12.95f);
    }

    @Test
    public void correctTotalForTwoItems(){
        var bill = new Bill();
        bill.add(12.95f);
        bill.add(13.50f);
        float total = bill.getTotal();

        assertThat(total).isEqualTo(26.45f);
    }
}
