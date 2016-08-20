package com.tomas.rest.app.core.services;

import com.tomas.rest.app.core.entity.AlbumEntity;
import com.tomas.rest.app.core.entity.ArtisEntity;
import com.tomas.rest.app.core.entity.SongsEntity;

import java.util.List;
import java.util.Map;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
public interface MusicServices
{
    Map<String, Object> getAll();

    ArtisEntity getArtis(Long id);
    List<ArtisEntity> getAllArtis(Long id);
    void addArtis(ArtisEntity artisEntity);
    void updateArtist(ArtisEntity artisEntity);
    void deleteArtist(ArtisEntity artisEntity);

    AlbumEntity getAlbum(Long id);
    List<AlbumEntity> getAllAlbum(Long id);
    void addAlbum(AlbumEntity albumEntity);
    void updateAlbum(AlbumEntity albumEntity);
    void deleteAlbum(AlbumEntity albumEntity);

    SongsEntity getSongs(Long id);
    List<SongsEntity> getAllSongs(Long id);
    void addSongs(SongsEntity songsEntity);
    void updateSongs(SongsEntity songsEntity);
    void deleteSongs(SongsEntity songsEntity);
}
