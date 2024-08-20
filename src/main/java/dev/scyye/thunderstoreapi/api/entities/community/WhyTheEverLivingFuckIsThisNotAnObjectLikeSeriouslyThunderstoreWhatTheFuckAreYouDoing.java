package dev.scyye.thunderstoreapi.api.entities.community;

import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.Nullable;

public class WhyTheEverLivingFuckIsThisNotAnObjectLikeSeriouslyThunderstoreWhatTheFuckAreYouDoing {
    static class Pagination {
        @Nullable
        String next_link, previous_link;
    }

    Pagination pagination;
    Community[] results;

    public Pagination getPagination() {
        return pagination;
    }

    public Community[] getResults() {
        return results;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
