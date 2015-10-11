package no.stelar7.api.l4j8.pojo.game;

import no.stelar7.api.l4j8.basic.APIObject;
import no.stelar7.api.l4j8.basic.constants.Team;

public class Player implements APIObject
{
    private Integer championId;
    private Long    summonerId;
    private Integer teamId;

    /**
     * Champion id associated with player.
     *
     * @return Integer
     */
    public Integer getChampionId()
    {
        return this.championId;
    }

    /**
     * Summoner id associated with player.
     *
     * @return Long
     */
    public Long getSummonerId()
    {
        return this.summonerId;
    }

    /**
     * a Team representing the team associated with player.
     *
     * @return Team
     */
    public Team getTeam()
    {
        return Team.getFromCode(this.teamId);
    }

    /**
     * Team id associated with player.
     *
     * @return Integer
     */
    public Integer getTeamId()
    {
        return this.teamId;
    }

    @Override
    public String toString()
    {
        return "Player [championId=" + this.championId + ", summonerId=" + this.summonerId + ", teamId=" + this.teamId + "]";
    }
}
