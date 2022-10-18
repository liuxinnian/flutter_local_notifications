package com.dexterous.flutterlocalnotifications.models.styles;

import androidx.annotation.Keep;

import com.dexterous.flutterlocalnotifications.models.BitmapSource;

@Keep
public class WeatherStyleInformation extends DefaultStyleInformation {
  public String contentTitle;
  public Boolean htmlFormatContentTitle;
  public String summaryText;
  public Boolean htmlFormatSummaryText;
  public Object largeIcon;
  public BitmapSource largeIconBitmapSource;
  public Object bigPicture;
  public BitmapSource bigPictureBitmapSource;
  public Boolean hideExpandedLargeIcon;
  //Weather
  public String todayWeather;
  public String tomorrowWeather;
  public Object todayPicture;
  public BitmapSource todayPictureBitmapSource;
  public Object tomorrowPicture;
  public BitmapSource tomorrowPictureBitmapSource;

  public WeatherStyleInformation(
      Boolean htmlFormatTitle,
      Boolean htmlFormatBody,
      String contentTitle,
      Boolean htmlFormatContentTitle,
      String summaryText,
      Boolean htmlFormatSummaryText,
      Object largeIcon,
      BitmapSource largeIconBitmapSource,
      Object bigPicture,
      BitmapSource bigPictureBitmapSource,
      String todayWeather,
      String tomorrowWeather,
      Object todayPicture,
      BitmapSource todayPictureBitmapSource,
      Object tomorrowPicture,
      BitmapSource tomorrowPictureBitmapSource,
      Boolean hideExpandedLargeIcon) {
    super(htmlFormatTitle, htmlFormatBody);
    this.contentTitle = contentTitle;
    this.htmlFormatContentTitle = htmlFormatContentTitle;
    this.summaryText = summaryText;
    this.htmlFormatSummaryText = htmlFormatSummaryText;
    this.largeIcon = largeIcon;
    this.largeIconBitmapSource = largeIconBitmapSource;
    this.bigPicture = bigPicture;
    this.bigPictureBitmapSource = bigPictureBitmapSource;
    this.hideExpandedLargeIcon = hideExpandedLargeIcon;
    this.todayWeather = todayWeather;
    this.tomorrowWeather = tomorrowWeather;
    this.todayPicture = todayPicture;
    this.todayPictureBitmapSource = todayPictureBitmapSource;
    this.tomorrowPicture = tomorrowPicture;
    this.tomorrowPictureBitmapSource = tomorrowPictureBitmapSource;
  }
}
