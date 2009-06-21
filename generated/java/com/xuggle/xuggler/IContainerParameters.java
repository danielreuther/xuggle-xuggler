/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Parameters that can be set on a {@link IContainer} before opening. 
 *  
 * <p>  
 * Normally this class can be ignored, but for some container formats, 
 * such  
 * as webcams, you need to specify additional meta-data information 
 * for  
 *  
 * and video width and height.  
 * </p>  
 * @see		IContainer#setParameters(IContainerParameters)  
 */
public class IContainerParameters extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected IContainerParameters(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIContainerParametersUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IContainerParameters obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IContainerParameters object that is actually referring to the
   * exact same underlying native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IContainerParameters copyReference() {
    return (IContainerParameters) super.copyReference();
  }

  /**
   * Releases ths instance of IContainerParameters and frees any underlying
   * native memory.
   * <p>
   * @{inheritDoc}
   * </p> 
   */
  public void delete()
  {
    do {} while(false); // remove a warning
    super.delete();
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IContainerParameters)
      equal = (((IContainerParameters)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code

/**
 * Get the time base. For container formats such as  
 * webcameras, this is used as the requested frame rate.  
 * @return	the time base.  
 */
  public IRational getTimeBase() {
    long cPtr = XugglerJNI.IContainerParameters_getTimeBase(swigCPtr, this);
    return (cPtr == 0) ? null : new IRational(cPtr, false);
  }

/**
 * Set the time base.  
 * @param	base The time base. Ignored if null.  
 * @see		#getTimeBase()  
 */
  public void setTimeBase(IRational base) {
    XugglerJNI.IContainerParameters_setTimeBase(swigCPtr, this, IRational.getCPtr(base), base);
  }

/**
 * Get the requested audio sample rate.  
 * For some container formats, such as Alsa Microphones,  
 * this is the sample-rate you want the mic to use.  
 * @return	the audio sample rate.  
 */
  public int getAudioSampleRate() {
    return XugglerJNI.IContainerParameters_getAudioSampleRate(swigCPtr, this);
  }

/**
 * Set the requested audio sample rate.  
 * @param	sampleRate the sample rate.  
 * @see		#getAudioSampleRate()  
 */
  public void setAudioSampleRate(int sampleRate) {
    XugglerJNI.IContainerParameters_setAudioSampleRate(swigCPtr, this, sampleRate);
  }

/**
 * Get the requested audio channels.  
 * For some container formats, such as DV cameras,  
 * this is the number of audio channels you'd like to get  
 * samples for.  
 * @return	the audio channels.  
 */
  public int getAudioChannels() {
    return XugglerJNI.IContainerParameters_getAudioChannels(swigCPtr, this);
  }

/**
 * Set the requested audio channels.  
 * @param	channels The number of channels.  
 * @see		#getAudioChannels()  
 */
  public void setAudioChannels(int channels) {
    XugglerJNI.IContainerParameters_setAudioChannels(swigCPtr, this, channels);
  }

/**
 * Get the requested video width.  
 * For some container formats, such as VFW (Video For Windows)  
 * this is the requested webcam video capture width.  
 * @return	the video width.  
 */
  public int getVideoWidth() {
    return XugglerJNI.IContainerParameters_getVideoWidth(swigCPtr, this);
  }

/**
 * Set the requested video width.  
 * @param	width The width in pixels.  
 * @see		#getVideoWidth()  
 */
  public void setVideoWidth(int width) {
    XugglerJNI.IContainerParameters_setVideoWidth(swigCPtr, this, width);
  }

/**
 * Get the requested video height.  
 * For some container formats, such as VFW (Video For Windows)  
 * this is the requested webcam video capture height.  
 * @return	the video height.  
 */
  public int getVideoHeight() {
    return XugglerJNI.IContainerParameters_getVideoHeight(swigCPtr, this);
  }

/**
 * Set the requested video height.  
 * @param	height The height in pixels.  
 * @see		#getVideoHeight()  
 */
  public void setVideoHeight(int height) {
    XugglerJNI.IContainerParameters_setVideoHeight(swigCPtr, this, height);
  }

/**
 * Get the requested video pixel format.  
 * For some container formats, such as VFW (Video For Windows)  
 * this is the requested webcam video capture pixel format.  
 * @return	the video pixel format.  
 */
  public IPixelFormat.Type getPixelFormat() {
    return IPixelFormat.Type.swigToEnum(XugglerJNI.IContainerParameters_getPixelFormat(swigCPtr, this));
  }

/**
 * Set the requested video pixel format.  
 * @param	type The pixel format.  
 * @see		#getPixelFormat()  
 */
  public void setPixelFormat(IPixelFormat.Type type) {
    XugglerJNI.IContainerParameters_setPixelFormat(swigCPtr, this, type.swigValue());
  }

/**
 * The TV channel requested.  
 * Some container formats (well devices really) can have  
 * a channel you're requesting. This is it.  
 * @return	the TV channel.  
 */
  public int getTVChannel() {
    return XugglerJNI.IContainerParameters_getTVChannel(swigCPtr, this);
  }

/**
 * Set the tv channel.  
 * @param	channel the tv channel  
 * @see		#getTVChannel()  
 */
  public void setTVChannel(int channel) {
    XugglerJNI.IContainerParameters_setTVChannel(swigCPtr, this, channel);
  }

/**
 * Get the TV Standard.  
 * For some container formats representing television tuners,  
 * this is the tv standard they will get data as (e.g.  
 * NTSC, PAL, SECAM).  
 * @return	the TV standard  
 */
  public String getTVStandard() {
    return XugglerJNI.IContainerParameters_getTVStandard(swigCPtr, this);
  }

/**
 * Set the TV Standard.  
 * @param	standard The TV standard. Empty strings are treated  
 * as null strings.  
 * @see		#getTVStandard()  
 */
  public void setTVStandard(String standard) {
    XugglerJNI.IContainerParameters_setTVStandard(swigCPtr, this, standard);
  }

/**
 * Are we forcing raw MPEG-2 transport stream output.  
 * @return	is MPEG-2 transport stream raw  
 */
  public boolean isMPEG2TSRaw() {
    return XugglerJNI.IContainerParameters_isMPEG2TSRaw(swigCPtr, this);
  }

/**
 * Force raw MPEG-2 transport stream output, if possible.  
 * @param	setting true to try forcing; false to not.  
 */
  public void setMPEG2TSRaw(boolean setting) {
    XugglerJNI.IContainerParameters_setMPEG2TSRaw(swigCPtr, this, setting);
  }

/**
 * Are we computing PCR for each transport stream packet?  
 * Only really meaningful if {@link #isMPEG2TSRaw()} is true.  
 * @return	computing PCR for each transport stream packet.  
 */
  public boolean isMPEG2TSComputePCR() {
    return XugglerJNI.IContainerParameters_isMPEG2TSComputePCR(swigCPtr, this);
  }

/**
 * Compute exact PCR for each transport stream packet  
 * (only meaningful if {@link #isMPEG2TSRaw()} is true).  
 * @param	setting true for true; false for false.  
 */
  public void setMPEG2TSComputePCR(boolean setting) {
    XugglerJNI.IContainerParameters_setMPEG2TSComputePCR(swigCPtr, this, setting);
  }

/**
 * If RTSP, will we pause the stream immediately?  
 * @return	true for yes, false for no.  
 */
  public boolean isInitialPause() {
    return XugglerJNI.IContainerParameters_isInitialPause(swigCPtr, this);
  }

/**
 * Should we pause the RTSP stream on open or immediately start?  
 * @param	setting true to pause; false to not.  
 */
  public void setInitialPause(boolean setting) {
    XugglerJNI.IContainerParameters_setInitialPause(swigCPtr, this, setting);
  }

/**
 * Create a new parameters object with default settings.  
 * @return	A new object, or null on error.  
 */
  public static IContainerParameters make() {
    long cPtr = XugglerJNI.IContainerParameters_make();
    return (cPtr == 0) ? null : new IContainerParameters(cPtr, false);
  }

}
