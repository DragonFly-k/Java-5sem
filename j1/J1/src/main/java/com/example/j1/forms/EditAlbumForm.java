package com.example.j1.forms;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditAlbumForm {
    private String title;
    private String author;
    private String newTitle;
    private String newAuthor;
}