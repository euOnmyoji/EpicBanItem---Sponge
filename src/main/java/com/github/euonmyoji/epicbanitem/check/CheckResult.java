package com.github.euonmyoji.epicbanitem.check;

import org.spongepowered.api.data.DataView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author yinyangshi GiNYAi ustc_zzzz
 */
public class CheckResult {
    List<CheckRule> breakRules;
    DataView view;

    private CheckResult() {
        breakRules = new ArrayList<>();
        view = null;
    }

    public static CheckResult empty() {
        return new CheckResult();
    }

    public List<CheckRule> getBreakRules() {
        return this.breakRules;
    }

    public Optional<DataView> getFinalView() {
        return Optional.ofNullable(this.view);
    }

    public boolean isBanned() {
        return this.breakRules.size() > 0;
    }
}