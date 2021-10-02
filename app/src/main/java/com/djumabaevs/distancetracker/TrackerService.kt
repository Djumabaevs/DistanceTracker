package com.djumabaevs.distancetracker

import androidx.lifecycle.LifecycleService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackerService : LifecycleService() {

    @Inject
    lateinit var notification: NotificationCompat.Builder

    @Inject
    lateinit var notificationManager: NotificationManager

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient



}