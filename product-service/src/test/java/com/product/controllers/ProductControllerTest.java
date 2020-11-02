package com.product.controllers;


import com.product.domains.Product;
import com.product.services.ProductService;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductService productService;

    @Test
    public void getProductsFromHttp() throws Exception {
        mockMvc.perform(
                get("/product/getall")
        ).andExpect(
                status().isOk()
        ).andExpect(
                jsonPath("$",hasSize(8))
        ).andExpect(
                jsonPath("$[0].id", is(8))

        );
    }

    @Test
    public void getProductsFromService() throws Exception {
        List<Product> products = productService.getProducts();
//        MatcherAssert.assertThat(products,hasItem(
//                anyOf(//will pass the test because we found given name even id not matched
//                        hasProperty("id",is(2l)),
//                        hasProperty("name",is("Macbook Pro 16"))
//                )
//        ));

//        MatcherAssert.assertThat(products,everyItem(
//                allOf(
//                        hasProperty("productCategory",hasProperty("id",is(1l)))
//                )
//        ));
        MatcherAssert.assertThat(products.size(),is(8));
    }

    @Test
    public void getProduct() throws Exception {
        Product product = productService.getProduct(1l);
        MatcherAssert.assertThat(product,
                allOf(
                        hasProperty("id", is(1l)),
                        hasProperty("name", is("Macbook Pro 16"))

                )
        );
    }

}
