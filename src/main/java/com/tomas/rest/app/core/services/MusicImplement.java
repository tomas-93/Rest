package com.tomas.rest.app.core.services;

import com.tomas.rest.app.core.entity.AlbumEntity;
import com.tomas.rest.app.core.entity.ArtisEntity;
import com.tomas.rest.app.core.entity.SongsEntity;
import com.tomas.rest.app.core.repository.Dao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Service
@Transactional
public class MusicImplement implements MusicServices
{
    @Inject
    private Dao dao;

    @Override
    public Map<String, Object> getAll()
    {
        Map<String, Object> listJoson =  new Hashtable<>();
        listJoson.put("Artista", this.dao.find("from ArtisEntity "));
        return listJoson;
    }

    /**
     * =======================
     * <p>Artisita</p>
     * =======================
     */
    @Override
    public ArtisEntity getArtis(Long id)
    {
        return this.dao.get(ArtisEntity.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<ArtisEntity> getAllArtis(Long id)
    {
        return (List<ArtisEntity>)
                this.dao.find("from ArtisEntity where id =:idArt", id);
    }


    @Override
    public void addArtis(ArtisEntity artisEntity)
    {
        this.dao.save(artisEntity);
    }

    @Override
    public void updateArtist(ArtisEntity artisEntity)
    {
        ArtisEntity artisEntity1 = this.dao.get(ArtisEntity.class, artisEntity.getId());
        if (artisEntity1 != null)
            this.dao.update(artisEntity);
    }

    @Override
    public void deleteArtist(ArtisEntity artisEntity)
    {
        ArtisEntity artisEntity1 = this.dao.get(ArtisEntity.class, artisEntity.getId());
        if (artisEntity1 != null)
            this.dao.delete(artisEntity);
    }

    /**
     * =======================
     * <p>Album</p>
     * =======================
     */
    @Override
    public AlbumEntity getAlbum(Long id)
    {
        return this.dao.get(AlbumEntity.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")

    public List<AlbumEntity> getAllAlbum(Long id)
    {
        return (List<AlbumEntity>)
                this.dao.find("from AlbumEntity where id=:idAlbum", id);
    }


    @Override
    public void addAlbum(AlbumEntity albumEntity)
    {
        this.dao.save(albumEntity);
    }

    @Override
    public void updateAlbum(AlbumEntity albumEntity)
    {
        AlbumEntity albumEntity1 = this.dao.get(AlbumEntity.class, albumEntity.getId());
        if (albumEntity1 != null)
            this.dao.update(albumEntity);
    }

    @Override
    public void deleteAlbum(AlbumEntity albumEntity)
    {
        AlbumEntity albumEntity1 = this.dao.get(AlbumEntity.class, albumEntity.getId());
        if (albumEntity1 != null)
            this.dao.delete(albumEntity);
    }

    /**
     * =======================
     * <p>Song</p>
     * =======================
     */
    @Override
    public SongsEntity getSongs(Long id)
    {
        return this.dao.get(SongsEntity.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SongsEntity> getAllSongs(Long id)
    {
        return (List<SongsEntity>)
                this.dao.find("from SongsEntity where id=:idS", id);
    }


    @Override
    public void addSongs(SongsEntity songsEntity)
    {
        this.dao.save(songsEntity);
    }

    @Override
    public void updateSongs(SongsEntity songsEntity)
    {
        SongsEntity songsEntity1 = this.dao.get(SongsEntity.class, songsEntity.getId());
        if (songsEntity1 != null)
            this.dao.update(songsEntity);
    }

    @Override
    public void deleteSongs(SongsEntity songsEntity)
    {
        SongsEntity songsEntity1 = this.dao.get(SongsEntity.class, songsEntity.getId());
        if (songsEntity1 != null)
            this.dao.delete(songsEntity);
    }
}
