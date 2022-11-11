package com.example.sitodo.functional;

import com.example.sitodo.util.VisitorCounter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("User Story 4: Count Number of Visits")
@Tag("e2e")
public class CountVisitorTest extends BaseFunctionalTest {

    @Autowired
    private VisitorCounter visitorCounter;

    @BeforeEach
    void setUp() {
        super.setUp();
    }

    @AfterEach
    void tearDown() {
        super.tearDown();

        // TODO: Lengkapi prosedur cleanup/teardown berikut yang akan dijalankan
        //       di akhir setiap test di dalam class test suite ini.
    }

    @Test
    @DisplayName("Ketika mengunjungi laman list pertama kali, jumlah kunjungan harus sebanyak 1")
    void singleVisit_toTodoList() throws InterruptedException {
        // TODO: Implementasi test sesungguhnya.
        // Minta browser (via Selenium) agar membuka URL berikut: “/”
        
        open("/");
        // Pause program test selama 500 milisekon untuk
        // memberikan kesempatan kepada browser untuk membuka
        // dan menampilkan URL yang diminta
        Thread.sleep(500);
        // Minta Selenium untuk mendapatkan referensi terhadap
        // elemen HTML dengan atribut ID bernilai visitor_count
        // dari jendela browser
        WebElement visitorCount = $(By.id("visitor_count"));
        // Cek nilai teks elemen HTML di atas apakah mengandung
        // sebuah string bernilai “1 time”
        assertThat(visitorCount.getText(), containsString("1 time"));
    }

    @Test
    @DisplayName("Ketika mengunjungi laman list tiga kali berturut-turut, jumlah kunjungan harus sebanyak 3")
    void multipleVisit_toTodoList() throws Exception {
        // TODO: Implementasi test sesungguhnya.
    }
}
