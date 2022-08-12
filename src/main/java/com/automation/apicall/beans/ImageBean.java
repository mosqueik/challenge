package com.automation.apicall.beans;

import com.automation.apicall.beans.images.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageBean {

    protected OriginalBean original;
    protected CommonBean downsized;
    protected CommonBean downsized_large;
    protected CommonBean downsized_medium;
    protected DownsizedSmallBean downsized_small;
    protected CommonBean downsized_still;
    protected DownsizedSmallBean preview;
    protected DownsizedSmallBean original_mp4;
    protected CommonBean fixed_height_small_still;
    protected CommonBean fixed_height_still;
    protected CommonBean fixed_width_small_still;
    protected CommonBean fixed_width_still;
    protected CommonBean original_still;
    protected CommonBean preview_still;
    protected CommonBean preview_webp;
    @JsonProperty("480w_still")
    protected CommonBean _480w_still;
    protected FixedBean fixed_height;
    protected FixedBean fixed_height_small;
    protected FixedBean fixed_width;
    protected FixedBean fixed_width_small;
    protected FixedDownSampledBean fixed_height_downsampled;
    protected FixedDownSampledBean fixed_width_downsampled;
    protected LoopingBean looping;

    public OriginalBean getOriginal() {
        return original;
    }

    public void setOriginal(OriginalBean original) {
        this.original = original;
    }

    public CommonBean getDownsized() {
        return downsized;
    }

    public void setDownsized(CommonBean downsized) {
        this.downsized = downsized;
    }

    public CommonBean getDownsized_large() {
        return downsized_large;
    }

    public void setDownsized_large(CommonBean downsized_large) {
        this.downsized_large = downsized_large;
    }

    public CommonBean getDownsized_medium() {
        return downsized_medium;
    }

    public void setDownsized_medium(CommonBean downsized_medium) {
        this.downsized_medium = downsized_medium;
    }

    public DownsizedSmallBean getDownsized_small() {
        return downsized_small;
    }

    public void setDownsized_small(DownsizedSmallBean downsized_small) {
        this.downsized_small = downsized_small;
    }

    public CommonBean getDownsized_still() {
        return downsized_still;
    }

    public void setDownsized_still(CommonBean downsized_still) {
        this.downsized_still = downsized_still;
    }

    public DownsizedSmallBean getPreview() {
        return preview;
    }

    public void setPreview(DownsizedSmallBean preview) {
        this.preview = preview;
    }

    public DownsizedSmallBean getOriginal_mp4() {
        return original_mp4;
    }

    public void setOriginal_mp4(DownsizedSmallBean original_mp4) {
        this.original_mp4 = original_mp4;
    }

    public CommonBean getFixed_height_small_still() {
        return fixed_height_small_still;
    }

    public void setFixed_height_small_still(CommonBean fixed_height_small_still) {
        this.fixed_height_small_still = fixed_height_small_still;
    }

    public CommonBean getFixed_height_still() {
        return fixed_height_still;
    }

    public void setFixed_height_still(CommonBean fixed_height_still) {
        this.fixed_height_still = fixed_height_still;
    }

    public CommonBean getFixed_width_small_still() {
        return fixed_width_small_still;
    }

    public void setFixed_width_small_still(CommonBean fixed_width_small_still) {
        this.fixed_width_small_still = fixed_width_small_still;
    }

    public CommonBean getFixed_width_still() {
        return fixed_width_still;
    }

    public void setFixed_width_still(CommonBean fixed_width_still) {
        this.fixed_width_still = fixed_width_still;
    }

    public CommonBean getOriginal_still() {
        return original_still;
    }

    public void setOriginal_still(CommonBean original_still) {
        this.original_still = original_still;
    }

    public CommonBean getPreview_still() {
        return preview_still;
    }

    public void setPreview_still(CommonBean preview_still) {
        this.preview_still = preview_still;
    }

    public CommonBean getPreview_webp() {
        return preview_webp;
    }

    public void setPreview_webp(CommonBean preview_webp) {
        this.preview_webp = preview_webp;
    }

    @JsonProperty("480w_still")
    public CommonBean get_480w_still() {
        return _480w_still;
    }

    @JsonProperty("480w_still")
    public void set_480w_still(CommonBean _480w_still) {
        this._480w_still = _480w_still;
    }

    public FixedBean getFixed_height() {
        return fixed_height;
    }

    public void setFixed_height(FixedBean fixed_height) {
        this.fixed_height = fixed_height;
    }

    public FixedBean getFixed_height_small() {
        return fixed_height_small;
    }

    public void setFixed_height_small(FixedBean fixed_height_small) {
        this.fixed_height_small = fixed_height_small;
    }

    public FixedBean getFixed_width() {
        return fixed_width;
    }

    public void setFixed_width(FixedBean fixed_width) {
        this.fixed_width = fixed_width;
    }

    public FixedBean getFixed_width_small() {
        return fixed_width_small;
    }

    public void setFixed_width_small(FixedBean fixed_width_small) {
        this.fixed_width_small = fixed_width_small;
    }

    public FixedDownSampledBean getFixed_height_downsampled() {
        return fixed_height_downsampled;
    }

    public void setFixed_height_downsampled(FixedDownSampledBean fixed_height_downsampled) {
        this.fixed_height_downsampled = fixed_height_downsampled;
    }

    public FixedDownSampledBean getFixed_width_downsampled() {
        return fixed_width_downsampled;
    }

    public void setFixed_width_downsampled(FixedDownSampledBean fixed_width_downsampled) {
        this.fixed_width_downsampled = fixed_width_downsampled;
    }

    public LoopingBean getLooping() {
        return looping;
    }

    public void setLooping(LoopingBean looping) {
        this.looping = looping;
    }
}
