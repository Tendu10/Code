package com.appsdeveloperblog.photoapp.api.albums.PhotoAppApiAlbums;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PhotoAppApiAlbumsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
    public void testHomeController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/1234/albums")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}

